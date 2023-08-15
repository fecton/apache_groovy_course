#!/usr/bin/env groovy
package Section_3_Groovy_Basics

// the line above is shebang line
import groovy.xml.*

def xml = new MarkupBuilder()

println "Hello, world!"

class Application {
    private final String NAME = "THE_REAL_DAN_VEGA"
}

println true
println false
println null


// it is a signle line comment
def msg = "This is my cool comment in the variable" // this is a message

// here you can see a multiple comment
/*
static void main(String[] args) {
  println "Hello world!"
}
*/

// Self documentation
/**
 * This is a person class
 * The person:
 *      born
 *      exists
 *      dies
 */
class Person {}


// --------------------------------------------------
//              ASSERTIONS
// --------------------------------------------------

assert true

assert 1 == 1

def x = 1
assert x == 1

// errors
// assert false

// assert 1 == 2

// assert 1 == (3+10) * 100 / 5 * 20


def y = [1,2,3,4,5]
assert (y << 6) == [6,7,8,9,10]
