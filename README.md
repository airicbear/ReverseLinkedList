# Reverse a Linked List

The linked list reversal algorithm implemented in Java, with comments.

# Run

``` sh
> javac Main.java
> java Main 1 2 3 4 5
[5,4,3,2,1]
```

# Algorithm

Reversing a linked list was more difficult than I initially expected.
At first, I thought I could figure it out in my head but I quickly realized
this type of problem would be much easier with a visual representation.

After many failed attempts of trying to solve the problem, I decided to
come up with a schematic way to represent the list using symbols.

First, I knew that a linked list looked like this:

```
1-->2-->3-->
```

Then, I needed a way to see the position of the root (`head`), so I decided to go with the `&` symbol:

```
&1-->2-->3-->
```

I understood that the `head` would need to point to `null`:

```
<--&1  2-->3-->
```

However, the rest of the list is now isolated.
So, we need some reference (`ptr`) to the next element before proceeding.
I will denote `ptr` with surrounding brackets `[]`.

```
<--&1  [2]-->3-->
```

Now we need the head to point to the new head of the list:

```
<--1  &[2]-->3-->
```

The reversed part of the list is now isolated, so there should be a reference to it which I use `%` to represent.

```
<--%1  &[2]-->3-->
```

We repeat the procedure until `ptr` is `null`.

```
<--%1  &2-->[3]-->
<--%1<--&2  [3]-->
<--1<--&%2  [3]-->
<--1<--%2  &[3]-->
<--1<--%2  &3-->[]
<--1<--%2<--&3  []
<--1<--2<--&%3  []
<--1<--2<--%3  &[]
```

Since `head` and `ptr` are both `null`, we return `prev`.

