class Solution:
    def reverseWords(self,s):
        words = s.split()
        reversed_words = [word[::-1] for word in words]
        return ' '.join(reversed_words)