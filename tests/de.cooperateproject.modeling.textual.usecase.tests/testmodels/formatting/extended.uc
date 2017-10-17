@start-ucd "diagram11"

rootElement RootElement

# abstract act hu as "AbstractHumanUser" role[human] note "abstr human comment"
# abstract act mu as "AbstractMachineUser" role[machine]
+ act HumanUser1 note "hum user comment"
+ act MachineUser1

sys System1 {
	note "sys 1 comment"
	uc UseCase1 {
		ep uc1extender
		ep uc1extender2
	}

	uc UseCase2 note "uc 2 comment"
	uc UseCase3
}

isa (HumanUser1, RootElement.hu)
isa (MachineUser1, RootElement.mu)
inc (UseCase2, UseCase3)
ext (UseCase2, UseCase1) ep[uc1extender] cond["Examplery extension condition"]
iac (HumanUser1, System1.UseCase1) card[1..1:0..*]
iac (HumanUser1, System1.UseCase3)
iac (MachineUser1, UseCase2)

@end-ucd