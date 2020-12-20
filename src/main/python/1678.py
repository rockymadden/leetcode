class Solution:
    def interpret(self, command: str) -> str:
        a = ''
        i = 0
        n = len(command)

        while i < n:
            c = command[i]
            i += 1

            if c == 'G':
                a += 'G'
            elif c == 'a':
                a += 'al'
                i += 2
            elif c != '(':
                a += "o"

        return a
