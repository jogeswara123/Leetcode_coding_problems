class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        r = set()
        re = []
        for i in nums:
            if i not in r:
                r.add(i)
            else:
                re.append(i)
        return re