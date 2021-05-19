

# what is an interface? 🚪
Oracle says: *"an interface is a group of related methods with empty bodies"*

I think of interfaces as a contract that a class promises the compiler to fulfill. If the class doesn't do what's promised the compiler will complain and give an error.

# why use one?  
**Why bind myself to this contract** and allow the compiler to yell at me about an unfulfilled promise?   
**Why don't I just write the methods** inside the class and be done with it?

After spending some time in the industry I started to form an understanding of why we use them. I will list the most important **three** reasons from my point of view.


# 1 - Document APIs 📜

Let's say your team is writing a new service to be added to the poll of services your company offers, and other teams will write some other services that are going to use your service.

How will they know what method to call? what parameters to pass? what return type to expect? 

Well, you guessed it, it's **interfaces**, the contract that ensures that those methods will always do as they describe in the interface.


# 2 - Write specifications 🖋

Imagine we want to write a specification of **what something should do, but not write how it should be done**, and leave that detail to whoever wishes to make it happen.
  
Perhaps the most famous example of this is the ***JPA (Java Persistence API)***  
**JPA** is a set of interfaces that defines how database persistence should look in Java applications. There are a couple of implementations of these interfaces  

 - Hibernate
 - Toplink
 - EclipseLink 
 - Apache OpenJPA 
 - and many more

# 3- Polymorphism 💡

The third and most important use-case of interfaces is the fact that they allow us to leverage the powerful concept of **Polymorphism**.  

 - Inheritance also allows Polymorphism. However, a class can only extend one superclass, while a class can implement as many interfaces as needed. That's why it's far more flexible.

This can make our code much more elegant and clean. But first, **what was Polymorphism**?  
It allows us to say a thing like: "A student object can be treated as a Human Object" or "A Car object can be treated as a Vehicle object".

  
