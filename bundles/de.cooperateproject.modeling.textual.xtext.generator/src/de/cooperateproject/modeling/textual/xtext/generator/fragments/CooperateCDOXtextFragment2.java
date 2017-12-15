package de.cooperateproject.modeling.textual.xtext.generator.fragments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.xtext.xtext.generator.IXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.Issues;

import com.google.inject.Injector;

import de.cooperateproject.modeling.textual.xtext.generator.derivedstate.DerivedStateCalculationFragment2;
import de.cooperateproject.modeling.textual.xtext.generator.issueresolution.AutomatedIssueResolutionFragment2;
import de.cooperateproject.modeling.textual.xtext.generator.naming.CooperateNamingBindingsFragment2;
import de.cooperateproject.modeling.textual.xtext.generator.outline.OutlineFragment2;
import de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment2;
import de.cooperateproject.modeling.textual.xtext.generator.services.ValueConverterFragment2;
import de.cooperateproject.modeling.textual.xtext.generator.templates.TemplateFragment2;
import de.cooperateproject.modeling.textual.xtext.generator.ui.CooperateEditorFragment;
import net.winklerweb.cdoxtext.generator.AddCDOXtextBindingsFragment2;
import net.winklerweb.cdoxtext.generator.emfcompare.EMFCompareMatcherFragment2;

public class CooperateCDOXtextFragment2 implements IXtextGeneratorFragment {

    private static final Collection<Class<? extends IXtextGeneratorFragment>> FRAGMENT_TYPES = Collections
            .unmodifiableCollection(getFragmentTypes());
    private final Collection<IXtextGeneratorFragment> fragmentInstances = new ArrayList<>();

    private static Collection<Class<? extends IXtextGeneratorFragment>> getFragmentTypes() {
        return Arrays.asList(AddCDOXtextBindingsFragment2.class, CooperateResourceHandlingBindingsFragment2.class,
                AutomatedIssueResolutionFragment2.class, CooperateNamingBindingsFragment2.class,
                EMFCompareMatcherFragment2.class, CooperateEditorFragment.class, DerivedStateCalculationFragment2.class,
                ValueConverterFragment2.class, TemplateFragment2.class, OutlineFragment2.class);
    }

    @Override
    public void checkConfiguration(Issues issues) {
        fragmentInstances.forEach(fragment -> fragment.checkConfiguration(issues));
    }

    @Override
    public void generate() {
        fragmentInstances.forEach(IXtextGeneratorFragment::generate);
    }

    @Override
    public void initialize(Injector injector) {
        try {
            fragmentInstances.clear();
            for (Class<? extends IXtextGeneratorFragment> fragmentType : FRAGMENT_TYPES) {
                IXtextGeneratorFragment fragment = fragmentType.newInstance();
                injector.injectMembers(fragment);
                fragmentInstances.add(fragment);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
