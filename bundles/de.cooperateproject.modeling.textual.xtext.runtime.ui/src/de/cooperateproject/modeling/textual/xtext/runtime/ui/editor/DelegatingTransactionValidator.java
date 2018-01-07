package de.cooperateproject.modeling.textual.xtext.runtime.ui.editor;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.impl.InternalTransaction;
import org.eclipse.emf.transaction.impl.TransactionValidator;

/**
 * Transaction validator that delegates all method calls to a given delegation target.
 */
public class DelegatingTransactionValidator implements TransactionValidator {

    private final TransactionValidator delegationTarget;

    /**
     * Constructs the validator.
     * 
     * @param delegationTarget
     *            The delegation target.
     */
    public DelegatingTransactionValidator(TransactionValidator delegationTarget) {
        this.delegationTarget = delegationTarget;
    }

    @Override
    public void add(InternalTransaction transaction) {
        delegationTarget.add(transaction);
    }

    @Override
    public void remove(InternalTransaction transaction) {
        delegationTarget.remove(transaction);
    }

    @Override
    public IStatus validate(Transaction tx) {
        return delegationTarget.validate(tx);
    }

    @Override
    public List<Notification> getNotificationsForValidation(Transaction tx) {
        return delegationTarget.getNotificationsForValidation(tx);
    }

    @Override
    public List<Notification> getNotificationsForPrecommit(Transaction tx) {
        return delegationTarget.getNotificationsForPrecommit(tx);
    }

    @Override
    public List<Notification> getNotificationsForPostcommit(Transaction tx) {
        return delegationTarget.getNotificationsForPostcommit(tx);
    }

    @Override
    public void dispose() {
        delegationTarget.dispose();
    }

}
