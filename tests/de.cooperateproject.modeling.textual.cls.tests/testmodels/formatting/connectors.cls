@start-cls "SomeName"

rootPackage RootElement

class A
class B
interface C

asc asc1 (A, B) role [first, second] card [1 : 1..*]
bi asc asc2 (A, B) card [1 : 1] note "B comment."
A impl C
A isa B
asc asc3 (A, B, C) role [a, b] card [1 : 1 : 1]
A note "A comment."

@end-cls