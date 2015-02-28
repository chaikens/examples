from myro import *

def getExperienceNumber():
    x = 0
#The # made this line a comment. The computer ignores comments.
#x is now 0.
    
    x = x + askQuestion01(
        "Do you now have either your own or a shared Myro Robot?")
#What is your answer?(Yes or No)_____________
#What is x now?  It is 0 if the answer was No, 1 otherwise.
#Write the current value of x here:_____

    x = x + askQuestion01(
        "Did you make the robot move with Myro commands?")
#What is your answer?_________  
#What is x now?  Write it here:_____
#Why must you have done addition?_____________________________________ 

    x = x + askQuestion01(
        "Have you written a web page in html?")
#What is x now?  Write it here:_____

    x = x + askQuestion01(
        "Have you ever written a computer program, even a simple one?" +
        "If you are not sure, answer no.")
#What is x now?  Write it here:_____

    x = x + askQuestion01(
        "Did you take a programming course?")
#What is x now?  Write it here:_____

    x = x + askQuestion01(
        "Did you take AP computer science?")
#What is x now?  Write it here:_____

    x = x + askQuestion01(
        "Did you do any robotics before?")
#What is x now?  Write it here:_____

    x = x + askQuestion(
        "How many semesters of calculus did you take, including AP",
        [0,1,2,3])
#What is x now?  Write it here:_____

    x = x + askQuestion(
        "Enter 1 if you're a freshman, 2 soph, 3 jr, 4 sr.",
        [1,2,3,4])
#What is x now?  Write it here:_____

    x = x + askQuestion(
        "From your birthday, select the one's digit of the day of the month.",
        range(0,10)) % 2
###########        a % b is the remainder when a is divided by b.
#Take a guess at what is a longer way of writing range(0,10).__________________
#What is x now?  Write it here:_____   

    import random
    x = x + random.randint(0,1)
#Toss a coin.  Add 0 to x if tails, 1 to x if heads.
#What is x now?  Write it here:_____

    return(x)

def askQuestion01(question):
    """This function asks a given yes-no question.
    If the answer is no, return 0.
    If the answer is yes, return 1."""
    reply = askQuestion(question,['Yes', 'No'])
    if reply == "Yes":
        return 1
    else:
        return 0

def main():
    print getExperienceNumber()
