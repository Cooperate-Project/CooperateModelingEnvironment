@start-clsd "SomeName"

rootPackage RootElement

class BasicClass

package SubPackage {
	class NestedClass1
}

package SubPackage2 {
	interface NestedInterface2
}

package SubPackage3 {
}

package SubPackage4 {
	import SubPackage3
	import SubPackage2
}

@end-clsd