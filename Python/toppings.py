# toppings.py coded by S.Chaiken for 9/02/09 TCSI201 class.
#
# Often there are many ways to write a programs that do the same thing.
# Carefully read the program below and figure out which of functions
# get_Toppings_1 and getToppings_2 would be better in a complete program.
# Explain why.


#Store manager: Edit these initial values to customize this program.
#You MUST end the toppings list with "no more".
TOPPINGS = ["anchovies", "peppers","onions","strawberries","no more"]

VERBOSE = False
PRICE_PER_TOPPING = 1.25 #dollars

def getToppings_1():
    print               #A blank line was printed.
    print "Using get_Toppings_1 to get the customer's choice(s)"
    nToppings = 0;      #Zero.
    choiceList = [];    #The list with nothing in it is called the empty list
    choice = askTextQuestion("First topping? Choose 'no more' if none.",TOPPINGS)
    while( choice != "no more" ):
        choice = askTextQuestion("Another topping, or no more?",TOPPINGS)
        nToppings = nToppings + 1
        choiceList = choiceList + [choice]
    print "That will be $",            #The comma means that the next print operation
    print nToppings*PRICE_PER_TOPPING, #will continue on the same line.  So, the 
    print " for ",                 #message that gives the cost and number 
    print nToppings,               #of toppings will all be printed on the same line.
    print "toppings."              #The cost/number message is now finished.
    if VERBOSE:
        print choiceList           #ONLY print the choice list if VERBOSE is True.


def getToppings_2():
    print
    print "Using get_Toppings_2 to get the customer's choice(s)"
    nToppings = 0;
    choiceList = [];
    choice = askTextQuestion("First topping? Choose 'no more' if none.",TOPPINGS)
    while( choice != "no more" ):
        nToppings = nToppings + 1
        choiceList = choiceList + [choice]
        choice = askTextQuestion("Another topping, or no more?",TOPPINGS)
    print "That will be $",
    print nToppings*PRICE_PER_TOPPING,
    print "for",
    print nToppings,
    print "toppings."
    if VERBOSE:
        print choiceList

def askTextQuestion(question,menu):
    print
    print question
    itemNumber = -1
    for item in menu:
        print "(",
        itemNumber = itemNumber + 1
        print itemNumber,
        print ") " + item
    chosenNumber = input("Type number for your choice:")
    return menu[chosenNumber]


def main():
    getToppings_1()
    getToppings_2()
