def validPassword(passwords, key):
    return 0


def numberOfUppercaseCharacter(password):
    count = 0
    for i in password:
        if i.isupper():
            count += 1
    print(count)

numberOfUppercaseCharacter("SaLam")
