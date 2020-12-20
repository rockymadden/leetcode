from typing import List

class Solution:
    def totalFruit(self, tree: List[int]) -> int:
        n = len(tree)
        baskets = [0] * n
        maximum = end = start = cnt = size = 0

        while (end < n):
            endFruit = tree[end]
            if baskets[endFruit] == 0:
                size += 1
            baskets[endFruit] += 1
            cnt += 1
            end += 1

            while (size > 2):
                startFruit = tree[start]
                if baskets[startFruit] == 1:
                    size -= 1
                baskets[startFruit] -= 1
                cnt -= 1
                start += 1

            maximum = max(maximum, cnt)

        return maximum
