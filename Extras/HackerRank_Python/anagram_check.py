def is_anagram(s1, s2):
    freq = {}

    for ch in s1:
        freq[ch] = freq.get(ch, 0) + 1

    for ch in s2:
        if ch not in freq:
            return False
        freq[ch] -= 1

    for i in freq:
        if freq[i] == 0:
            continue
            
        else:
            return False

if __name__ == "__main__":
    print(is_anagram("listen", "silent"))   # expected True
    print(is_anagram("triangle", "integral")) # expected True
    print(is_anagram("apple", "papel"))     # expected True
    print(is_anagram("rat", "car"))         # expected False
    print(is_anagram("aabb", "ab"))          # expected False
