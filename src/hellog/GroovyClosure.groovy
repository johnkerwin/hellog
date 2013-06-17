package hellog

// closure to square 
def square = { it * it }

//
println square(10)

// Take each member of the collection square it then print out the collection
[ 1, 2, 3, 4 ].collect(square).each({ a -> println "${a}" })


def printMapClosure = { key, value -> println key + "=" + value }

printMapClosure("a",1)

[ "Apple" : "Red", "Orange" : "Orange", "Pear" : "Green" ].each(printMapClosure)
