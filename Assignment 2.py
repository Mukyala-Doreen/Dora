#Creating an Empty list
my_list = []
#Appending the list
my_list.append(10)
my_list.append(20)
my_list.append(30)
my_list.append(40)

#inserting
my_list.insert(1, 15)

# Extend the list with [50, 60, 70]
my_list.extend([50, 60, 70])

# Removing  the last element from the list
my_list.pop()

# Sorting the list in ascending order
my_list.sort()
# Finding the index of value 30
index_30 = my_list.index(30)
print("Sorted list:", my_list)
print("Index of 30:", index_30)
