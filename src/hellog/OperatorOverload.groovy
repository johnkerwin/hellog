package hellog


class Foo {
    def count
    def plus(foo){
        return new Foo(count:foo.count + this.count)
    }
    
}


def foo = new Foo(count:10)
def bar = new Foo(count:10)
def baz = foo + bar

println baz.class
println baz.count

