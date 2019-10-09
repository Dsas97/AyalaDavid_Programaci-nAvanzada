print('Hellow World')
names = ['Francisco', 'Adrian','Carlos']

ages = [10,50,15]
print(names)
print('I have this names: {} with this ages {}'.format(names, ages)) #imprimir names mas ages

names.append('Christian')  #agregar atributos
names.extend(["Juan" , 'Pedro'])
print(names)

ivan = names.pop()
print(ivan)
print(names)

names.insert(1,'Ivan')
print(names)


name = "Wladimir"

if name == 'Wladimir':
    print(True)
else:
    print(False)

if name == 'Wladimir':
    print(True)
elif name == 'Wladimir1':
    print('Your name is {}'.format(name))
else:
    print(False)

for i in range(10):
    print(i)

for name in names:
    print(name)
age1, age2, age3 = ages
print('{} {} {}'.format(age1,age2,age3))

for name_age in zip(names, ages): #emparejar dos listas
    print(name_age)

for name, age in zip(names, ages):
    print('{} -> {}'.format(name, age))\


while names:
    print(names.pop())

#def pretty_print_list(input_list: list ): #lista con parametros
    #pass 
str_ages = list(map(str,ages))
print(ages)
print(str_ages)

def pretty_print_list(input_list: list):
    print('->'.join(input_list))

proc_list = [pretty_print_list, print]

proc_list[0](names)
proc_list[0](str_ages)
proc_list[1](names)
proc_list[1](str_ages)

pretty_print_list(names) 
pretty_print_list(str_ages)   


class Student:

        color = 'White'

        class Meta:
            name = 'This is a metaclass'
        def __init__(self, _id, _name, _age, _cell_number):
            self.id = _id
            self.name = _name
            self.age = _age
            self.__private_age = 1000

            class CellPhone:
                def __init__(self, number):
                    self.number = number

            self.phone = CellPhone(_cell_number)
        
        def __repr__(self):
            return 'Student({})'.format(self.__dict__)

print(Student('l00365889', 'David', 22, 0))
print(Student('l00365849', 'Alexander', 22,0))
print(Student.color)

squared_nums = [num**2 for num in range(10)]

print(squared_nums)

student = {
    'name': 'David',
    'age' : 22
}

print(student['name'])
print(student['age'])

a= 20 if squared_nums[1] == 0 else 10 if squared_nums[0] == 0 else 5
print(a)

def printfer(print_func, input_list):
    print_func(input_list)







