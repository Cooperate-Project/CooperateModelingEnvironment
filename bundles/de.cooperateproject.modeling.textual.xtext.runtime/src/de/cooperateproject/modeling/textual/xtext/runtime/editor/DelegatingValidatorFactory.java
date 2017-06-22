package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import org.eclipse.emf.transaction.impl.TransactionValidator;
import org.eclipse.emf.transaction.impl.TransactionValidator.Factory;

/**
 * {@link Factory} for {@link TransactionValidator} elements that simply delegates all calls to a delegation target.
 */
public class DelegatingValidatorFactory implements Factory {

    private final TransactionValidator.Factory delegationTarget;

    /**
     * Constructs the factory.
     * 
     * The default delegation target is {@link Factory#INSTANCE}
     */
    public DelegatingValidatorFactory() {
        this(TransactionValidator.Factory.INSTANCE);
    }

    /**
     * Constructs the factory.
     * 
     * @param delegationTarget
     *            The delegation target.
     */
    public DelegatingValidatorFactory(TransactionValidator.Factory delegationTarget) {
        this.delegationTarget = delegationTarget;
    }

    @Override
    public TransactionValidator createReadOnlyValidator() {
        return delegationTarget.createReadOnlyValidator();
    }

    @Override
    public TransactionValidator createReadWriteValidator() {
        return delegationTarget.createReadWriteValidator();
    }

}
