lines = []
reserved_keywords = ["auto", "else", "long", "switch",            # these are the reserved
                    "break", "enum", "register", "typedef",       # keywords for C language
                    "case", "extern", "return",	"union",          # since the input will be
                    "char", "float", "short", "unsigned",         # given in C language
                    "const", "for", "signed", "void",             # as per the question
                    "continue", "goto",	"sizeof", "volatile",
                    "default", "if", "static", "while",
                    "do", "int", "struct", "_Packed",
                    "double"]

math_operators = ['+', '-', '*', '/', '%', '++', '--', '=', '+=', '-=', '*=', '/=', '%=',
                  '&', '|', '^', '`', '<<', '>>']

logical_operators = ['==', '!=', '>', '<', '>=', '<=', '&&', '||', '!']

others = [',', ';', '{', '}', '(', ')', '[', ']', '?', '.', ':', '"', '@', '#', '$']

output_keywords, output_identifiers, output_math_operators = [], [], []
output_logical_operators, output_numerical_values, output_others = [], [], []

with open("input.txt") as fp:
    Lines = fp.readlines()
    for line in Lines:
        lines.append(line.strip())

for line in lines:
    lexemes = line.split()
    for i in lexemes:
        if i in reserved_keywords:
            if i not in output_keywords: output_keywords.append(i)
        elif i in math_operators:
            if i not in output_math_operators: output_math_operators.append(i)
        elif i in logical_operators:
            if i not in output_logical_operators: output_logical_operators.append(i)
        elif i in others:
            if i not in output_others: output_others.append(i)
        elif i[0].isdigit() and i[-1].isdigit():
            if i not in output_numerical_values: output_numerical_values.append(i)
        elif i not in output_identifiers: output_identifiers.append(i)

###### now the printing phase ######

print('Keywords:', end=' ')
for i in output_keywords:
    if i != output_keywords[-1]: print(i, end=', ')
    else: print(i)

print('Identifiers:', end=' ')
for i in output_identifiers:
    if i != output_identifiers[-1]: print(i, end=', ')
    else: print(i)

print('Math Operators:', end=' ')
for i in output_math_operators:
    if i != output_math_operators[-1]: print(i, end=',')
    else: print(i)

print('Logical Operators:', end=' ')
for i in output_logical_operators:
    if i != output_logical_operators[-1]: print(i, end=',')
    else: print(i)

print('Numerical Values:', end=' ')
for i in output_numerical_values:
    if i != output_numerical_values[-1]: print(i, end=', ')
    else: print(i)

print('Others:', end=' ')
for i in output_others:
    if i != output_others[-1]: print(i, end='')
    else: print(i)