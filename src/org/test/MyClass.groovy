//IMPORTANTE ALTRIEMNTI NON FUNZIONA SU JENKINS
package org.test

class MyClass {
    static void main(String[] args) {
        println "Hello world!"
    }

    def hello = { ->
        return  "Hello world!"
    }
}
