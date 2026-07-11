# HashMap / HashSet Pattern

## 1. Contains Duplicate
Information stored:
Value -> Presence (HashSet)

Idea:
Store every visited element.
If it already exists, return true.

---

## 2. Two Sum
Information stored:
Value -> Index

Idea:
For each number, compute the complement.
If the complement already exists, return the two indices.

---

## 3. Valid Anagram
Information stored:
Character -> Frequency

Idea:
Count frequencies in the first string.
Decrease frequencies using the second string.
Every frequency must end at zero.