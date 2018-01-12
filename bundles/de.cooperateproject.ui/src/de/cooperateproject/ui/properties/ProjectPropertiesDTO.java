package de.cooperateproject.ui.properties;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.core.runtime.IStatus;

import de.cooperateproject.ui.util.IValidateable;
import de.cooperateproject.ui.wizards.projectnew.CDOCredentialsValidator;

public class ProjectPropertiesDTO implements IValidateable {

    private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private String cdoHost;
    private Integer cdoPort;
    private String cdoRepo;

    public String getCdoHost() {
        return cdoHost;
    }

    public void setCdoHost(String cdoHost) {
        String oldValue = this.cdoHost;
        this.cdoHost = cdoHost;
        firePropertyChange("cdoHost", oldValue, cdoHost);
    }

    public Integer getCdoPort() {
        return cdoPort;
    }

    public void setCdoPort(Integer cdoPort) {
        Integer oldValue = this.cdoPort;
        this.cdoPort = cdoPort;
        firePropertyChange("cdoPort", oldValue, cdoPort);
    }

    public String getCdoRepo() {
        return cdoRepo;
    }

    public void setCdoRepo(String cdoRepo) {
        String oldValue = this.cdoRepo;
        this.cdoRepo = cdoRepo;
        firePropertyChange("cdoRepo", oldValue, cdoRepo);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
        changeSupport.firePropertyChange(propertyName, oldValue, newValue);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cdoHost == null) ? 0 : cdoHost.hashCode());
        result = prime * result + ((cdoPort == null) ? 0 : cdoPort.hashCode());
        result = prime * result + ((cdoRepo == null) ? 0 : cdoRepo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ProjectPropertiesDTO other = (ProjectPropertiesDTO) obj;
        if (cdoHost == null) {
            if (other.cdoHost != null) {
                return false;
            }
        } else if (!cdoHost.equals(other.cdoHost)) {
            return false;
        }
        if (cdoPort == null) {
            if (other.cdoPort != null) {
                return false;
            }
        } else if (!cdoPort.equals(other.cdoPort)) {
            return false;
        }
        if (cdoRepo == null) {
            if (other.cdoRepo != null) {
                return false;
            }
        } else if (!cdoRepo.equals(other.cdoRepo)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        IStatus result = CDOCredentialsValidator.validate(getCdoHost(), getCdoPort(), getCdoRepo());
        return result.isOK();
    }

}
