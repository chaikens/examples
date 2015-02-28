def newPounds(pounds,shillings,pence):
    return pounds + shillings/20.0 + pence/(20.0*12.0)

def oldMoney( newPence ):
    oldPounds = 0
    oldShillings = 0
    oldPence = 0.0
    pencePerPound = 20.0*12.0
    pencePerShilling = 12.0
    penceLeft = newPence
    while penceLeft >= 0.0:
        penceLeft = penceLeft - pencePerPound
        oldPounds = oldPounds + 1
    oldPounds = oldPounds - 1
    penceLeft = penceLeft + pencePerPound
    while penceLeft >= 0.0:
        penceLeft = penceLeft - pencePerShilling
        oldShillings = oldShillings + 1
    oldShillings = oldShillings - 1
    penceLeft = penceLeft + pencePerShilling
    return oldPounds, oldShillings, penceLeft


    
    
