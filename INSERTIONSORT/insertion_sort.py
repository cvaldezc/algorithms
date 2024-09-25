#!/usr/bin/env python
# -*- coding: utf-8 -*-

numbers = [5, 2, 4, 6, 1, 3]

print(numbers)

for index in range(1, len(numbers)):
    key = numbers[index]
    j = index - 1
    while j > -1 and numbers[j] > key:
        numbers[j + 1] = numbers[j]
        j = j - 1

    numbers[j + 1] = key

print(numbers)
