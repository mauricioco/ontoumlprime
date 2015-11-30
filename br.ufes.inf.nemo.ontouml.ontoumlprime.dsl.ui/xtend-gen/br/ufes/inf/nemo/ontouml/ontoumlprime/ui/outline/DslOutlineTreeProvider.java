/**
 * generated by Xtext
 */
package br.ufes.inf.nemo.ontouml.ontoumlprime.ui.outline;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import com.google.common.base.Objects;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;
import org.eclipse.xtext.util.ITextRegion;

/**
 * Customization of the default outline structure.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
@SuppressWarnings("all")
public class DslOutlineTreeProvider extends DefaultOutlineTreeProvider {
  /**
   * protected void _createChildren(DocumentRootNode parentNode,
   * Domainmodel domainModel) {
   * for (AbstractElement element : domainModel.getElements()) {
   * createNode(parentNode, element);
   * }
   * }
   */
  protected void _createChildren(final DocumentRootNode parentNode, final Model model) {
    EList<PackageableElement> _elements = model.getElements();
    for (final PackageableElement element : _elements) {
      this.createNode(parentNode, element);
    }
  }
  
  @Override
  protected void _createNode(final IOutlineNode parentNode, final EObject modelElement) {
    final Object text = this.textDispatcher.invoke(modelElement);
    final Boolean isLeaf = this.isLeafDispatcher.invoke(modelElement);
    boolean _and = false;
    boolean _equals = Objects.equal(text, null);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(isLeaf, null);
      _and = _equals_1;
    }
    if (_and) {
      return;
    }
    final Image image = this.imageDispatcher.invoke(modelElement);
    this.createEObjectNode(parentNode, modelElement, image, text, (isLeaf).booleanValue());
  }
  
  @Override
  protected EObjectNode createEObjectNode(final IOutlineNode parentNode, final EObject modelElement, final Image image, final Object text, final boolean isLeaf) {
    final EObjectNode eObjectNode = new EObjectNode(modelElement, parentNode, image, text, isLeaf);
    final ICompositeNode parserNode = NodeModelUtils.getNode(modelElement);
    boolean _notEquals = (!Objects.equal(parserNode, null));
    if (_notEquals) {
      ITextRegion _textRegion = parserNode.getTextRegion();
      eObjectNode.setTextRegion(_textRegion);
    }
    boolean _isLocalElement = this.isLocalElement(parentNode, modelElement);
    if (_isLocalElement) {
      ITextRegion _significantTextRegion = this.locationInFileProvider.getSignificantTextRegion(modelElement);
      eObjectNode.setShortTextRegion(_significantTextRegion);
    }
    return eObjectNode;
  }
  
  @Override
  protected EStructuralFeatureNode createEStructuralFeatureNode(final IOutlineNode parentNode, final EObject owner, final EStructuralFeature feature, final Image image, final Object text, final boolean isLeaf) {
    final boolean isFeatureSet = owner.eIsSet(feature);
    final EStructuralFeatureNode eStructuralFeatureNode = new EStructuralFeatureNode(owner, feature, parentNode, image, text, (isLeaf || (!isFeatureSet)));
    if (isFeatureSet) {
      ITextRegion region = this.locationInFileProvider.getFullTextRegion(owner, feature, 0);
      boolean _isMany = feature.isMany();
      if (_isMany) {
        Object _eGet = owner.eGet(feature);
        final int numValues = ((Collection<?>) _eGet).size();
        final ITextRegion fullTextRegion = this.locationInFileProvider.getFullTextRegion(owner, feature, (numValues - 1));
        boolean _notEquals = (!Objects.equal(fullTextRegion, null));
        if (_notEquals) {
          ITextRegion _merge = region.merge(fullTextRegion);
          region = _merge;
        }
      }
      eStructuralFeatureNode.setTextRegion(region);
    }
    return eStructuralFeatureNode;
  }
}
