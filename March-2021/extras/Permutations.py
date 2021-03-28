from itertools import permutations

#Splits the input with tabular
string, num = input().split(" ")
#Gets the permutations of num in the word
l = list(permutations(string, int(num)))
#Sort
l.sort()
#Join funtions avoids print the permutations
# like '(A , B)'
for i in l:
    print("".join(i))
