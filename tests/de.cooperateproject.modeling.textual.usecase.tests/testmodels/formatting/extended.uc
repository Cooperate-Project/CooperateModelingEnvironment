@start-uc "diagram11"

rootElement RootElement

# abstract actor "AbstractHumanUser" as hu [human]
# abstract actor "AbstractMachineUser" as mu [machine]
+ actor HumanUser1
+ actor MachineUser1

system System1 {
	usecase UseCase1 {
		extensionpoint uc1extender
	}

	usecase UseCase2
	usecase UseCase3
}

HumanUser1 isA RootElement.hu
MachineUser1 isA RootElement.mu
UseCase2 inc UseCase3
UseCase2 ext UseCase1 [uc1extender|"Examplery extension condition"]
HumanUser1 iac System1.UseCase1
HumanUser1 iac System1.UseCase3
MachineUser1 iac UseCase2

@end-uc