import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.impute import SimpleImputer
from sklearn.preprocessing import LabelEncoder, MinMaxScaler, StandardScaler
from sklearn.svm import SVC
from sklearn.ensemble import RandomForestClassifier
from sklearn.neural_network import MLPClassifier
from sklearn.decomposition import PCA


def handling_missing_values():
    global data

    data = data.dropna(axis=0, subset=['sex', 'anatom_site_general_challenge'])
    impute = SimpleImputer(missing_values=np.nan, strategy='mean')
    impute.fit(data[['age_approx']])
    data['age_approx'] = impute.transform(data[['age_approx']])


def encoding_categorical_features():
    global data

    to_drop = ['image_name', 'patient_id', 'patient_code']
    data = data.drop(to_drop, axis=1)
    to_drop = ['benign_malignant', 'diagnosis']
    data = data.drop(to_drop, axis=1)

    data = pd.concat([data.drop('anatom_site_general_challenge', axis=1),
                      pd.get_dummies(data['anatom_site_general_challenge'])],
                     axis=1)

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
    return train_test_split(data[x_col], data[[y_col]], test_size=0.20, random_state=20)


def scaling_and_pca():
    global data

    columns = list(data.columns)
    x_col = columns[:2] + columns[3:]
    y_col = columns[2]
    feature_values = StandardScaler().fit_transform(data[x_col])
    feature_values = PCA(n_components=x_train.shape[1]//2).fit_transform(feature_values)
    feature_values = pd.DataFrame(feature_values)
    return train_test_split(feature_values, data[[y_col]], test_size=0.20, random_state=20)


# ------------- driver code -------------- #

data = pd.read_csv('Melanoma TFRecords 256x256.csv')
handling_missing_values()
encoding_categorical_features()
feature_scaling()
x_train, x_test, y_train, y_test = dataset_splitting()

svc_scores = ['SVA']
mlp_scores = ['MLP']
rfc_scores = ["RFC"]

print("\nPre-PCA Scores are being calculated\n")

svc_model = SVC(kernel="linear").fit(x_train, y_train.values.ravel())
svc_result = svc_model.score(x_test, y_test)
svc_scores.append(svc_result)

mlp_model = MLPClassifier(hidden_layer_sizes=5, activation="relu", max_iter=1000).fit(x_train, y_train.values.ravel())
mlp_result = mlp_model.score(x_test, y_test)
mlp_scores.append(mlp_result)

rfc_model = RandomForestClassifier(n_estimators=50).fit(x_train, y_train.values.ravel())
rfc_result = rfc_model.score(x_test, y_test)
rfc_scores.append(rfc_result)

print("\nPost-PCA Scores are being calculated\n")

x_train, x_test, y_train, y_test = scaling_and_pca()

svc_model = SVC(kernel="linear").fit(x_train, y_train.values.ravel())
svc_result = svc_model.score(x_test, y_test)
svc_scores.append(svc_result)

mlp_model = MLPClassifier(hidden_layer_sizes=5, activation="relu", max_iter=1000).fit(x_train, y_train.values.ravel())
mlp_result = mlp_model.score(x_test, y_test)
mlp_scores.append(mlp_result)

rfc_model = RandomForestClassifier(n_estimators=50).fit(x_train, y_train.values.ravel())
rfc_result = rfc_model.score(x_test, y_test)
rfc_scores.append(rfc_result)

all_results = np.array([svc_scores, mlp_scores, rfc_scores])
scores = pd.DataFrame(data=all_results, columns=['Classifier', 'Pre-PCA', 'Post-PCA'])

scores['Pre-PCA'] = pd.to_numeric(scores['Pre-PCA'])
scores['Post-PCA'] = pd.to_numeric(scores['Post-PCA'])

fig, ax = plt.subplots()
scores.plot.bar(x='Classifier', y=['Pre-PCA', 'Post-PCA'], rot=1.0, ax=ax)

print('\nCalculations are done. See the bar graph for better visualization\n')
plt.show()
