def A():
    print "A called"
    def B():
        print "B called"
        print "B returned"
    print "A returning"
    return B

fun = A()
print fun
fun()


