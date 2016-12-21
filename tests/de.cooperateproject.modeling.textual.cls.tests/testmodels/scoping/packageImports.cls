@start-cls "Test"

rootPackage rootElement

package package1 {

	package package1_1 {
	
		package package1_1_1 {
		
			class AnotherClass
		
		}
	
	}
	
	package package1_2 {
	
		package package1_2_1 {
			import package1.package1_1.package1_1_1
			
			class SomeClass {
				someAttr : int
				anotherAttr : AnotherClass
			}
		}
	
	}

}

@end-cls