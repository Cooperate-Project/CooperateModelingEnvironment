@start-cls "SomeName"

rootPackage RootElement

class A
class B
interface C

asc A asc1 B [1, first | 1..*, second]
bi asc A asc2 B [1 | 1] note "B comment."
A impl C
A isa B
asc asc3 {
	A a 1 <;
	B b 1 <;
	C 1;
}

A note "A comment."

@end-cls