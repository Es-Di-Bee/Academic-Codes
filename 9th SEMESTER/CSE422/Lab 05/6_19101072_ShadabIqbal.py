import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.impute import SimpleImputer
from sklearn.preprocessing import LabelEncoder, MinMaxScaler
from sklearn.linear_model import LogisticRegression
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score


def print_database(database):  # this function is used for debugging

    pd.options.display.width = None
    pd.options.display.max_columns = None
    pd.set_option('display.max_rows', 3000)
    pd.set_option('display.max_columns', 3000)

    print(database)


def handling_missing_values():
    global data

    # dropping these rows because they have non-numerical values
    data = data.dropna(axis=0, subset=['sex', 'anatom_site_general_challenge'])

    # imputing this row because we can find the mean of this column
    impute = SimpleImputer(missing_values=np.nan, strategy='mean')
    impute.fit(data[['age_approx']])
    data['age_approx'] = impute.transform(data[['age_approx']])


def encoding_categorical_features():
    global data

    # first, dropping the irrelevant columns
    to_drop = ['image_name', 'patient_id', 'patient_code']
    data = data.drop(to_drop, axis=1)

    # then dropping the columns which provide biased output
    to_drop = ['benign_malignant', 'diagnosis']
    data = data.drop(to_drop, axis=1)

    # making 1-hot vector of 'anatom_site_general_challenge' column
    data = pd.concat([data.drop('anatom_site_general_challenge', axis=1),
                      pd.get_dummies(data['anatom_site_general_challenge'])],
                     axis=1)

    # binary encoding the 'sex' column
    encoder = LabelEncoder()
    data['sex'] = encoder.fit_transform(data['sex'])


def feature_scaling():
    global data

    columns = list(data.columns)
    x_col = columns[:2] + columns[3:]
    scaler = MinMaxScaler()
    scaler.fit(data[x_col])
    data[x_col] = scaler.transform(data[x_col])


def dataset_splitting():
    global data

    columns = list(data.columns)
    x_col = columns[:2] + columns[3:]
    y_col = columns[2]
    return train_test_split(data[x_col], data[[y_col]], test_size=0.20)


# ------------- driver code -------------- #


data = pd.read_csv('Melanoma TFRecords 256x256.csv')
handling_missing_values()
encoding_categorical_features()
feature_scaling()
x_train, x_test, y_train, y_test = dataset_splitting()

logistic_regression_prediction = LogisticRegression().fit(x_train, y_train.values.ravel()).predict(x_test)

decision_tree_prediction = DecisionTreeClassifier(criterion='entropy', random_state=1).fit(x_train, y_train.values.ravel()).predict(x_test)

scores = []

print("\nAccuracy using Logistic Regression is:")
print(round(accuracy_score(y_test, logistic_regression_prediction), 6) * 100, "%")
scores.append(accuracy_score(y_test, logistic_regression_prediction))

print("\nAccuracy using Decision Tree is:")
print(round(accuracy_score(y_test, decision_tree_prediction), 6) * 100, "%")
scores.append(accuracy_score(y_test, decision_tree_prediction))


fig = plt.figure(figsize=(7, 4))
classifier = ['Logistic Regression', 'Decision Tree']
plt.bar(classifier, scores, width=0.4)

plt.show()
