def LengthOfLastWord(self, s):
    s = s.strip();
    space = s.rfind(" ")
    if (space != -1):
        return len(s[space+1:])
    else:
        return len(s)


def main() :
    print(LengthOfLastWord("Hello World"))