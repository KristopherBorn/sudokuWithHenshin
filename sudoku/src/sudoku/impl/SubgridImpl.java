/**
 */
package sudoku.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sudoku.Field;
import sudoku.Subgrid;
import sudoku.SudokuPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subgrid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sudoku.impl.SubgridImpl#getFildsInBox <em>Filds In Box</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubgridImpl extends MinimalEObjectImpl.Container implements Subgrid {
	/**
	 * The cached value of the '{@link #getFildsInBox() <em>Filds In Box</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFildsInBox()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fildsInBox;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubgridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SudokuPackage.Literals.SUBGRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFildsInBox() {
		if (fildsInBox == null) {
			fildsInBox = new EObjectResolvingEList<Field>(Field.class, this, SudokuPackage.SUBGRID__FILDS_IN_BOX);
		}
		return fildsInBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SudokuPackage.SUBGRID__FILDS_IN_BOX:
				return getFildsInBox();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SudokuPackage.SUBGRID__FILDS_IN_BOX:
				getFildsInBox().clear();
				getFildsInBox().addAll((Collection<? extends Field>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SudokuPackage.SUBGRID__FILDS_IN_BOX:
				getFildsInBox().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SudokuPackage.SUBGRID__FILDS_IN_BOX:
				return fildsInBox != null && !fildsInBox.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubgridImpl
