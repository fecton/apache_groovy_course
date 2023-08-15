package Section_3_Groovy_Basics

// Lessons 24-25

public class Developer {
    private String firstname
    private String lastname

    def languages = []

    void work() {
        println "$firstname $lastname is working!"
    }

    void setFirstname(String v) {
        this.firstname = v
    }

    void setLastname(String v) {
        this.lastname = v
    }

    void WhatLanguagesDoYouKnow() {
        println "Hi! I know the following languages:"
        languages.each { language ->
           println language
        }
    }
}

Developer d = new Developer()

String fname = "Dan"
String lname = "Vega"

d.setFirstname(fname)
d.setLastname(lname)

// append some languages
d.languages << "Groovy"
d.languages << "Java"

d.work()

d.WhatLanguagesDoYouKnow()



println "Hello, world"