/**
 */
package sudoku.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import sudoku.Column;
import sudoku.Field;
import sudoku.Row;
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
 *   <li>{@link sudoku.impl.SubgridImpl#getFieldsInBox <em>Fields In Box</em>}</li>
 *   <li>{@link sudoku.impl.SubgridImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link sudoku.impl.SubgridImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubgridImpl extends MinimalEObjectImpl.Container implements Subgrid {
	/**
	 * The cached value of the '{@link #getFieldsInBox() <em>Fields In Box</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldsInBox()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fieldsInBox;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> rows;
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

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
	public EList<Field> getFieldsInBox() {
		if (fieldsInBox == null) {
			fieldsInBox = new EObjectWithInverseResolvingEList<Field>(Field.class, this, SudokuPackage.SUBGRID__FIELDS_IN_BOX, SudokuPackage.FIELD__SUB_GRID);
		}
		return fieldsInBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getRows() {
		if (rows == null) {
			rows = new EObjectWithInverseResolvingEList.ManyInverse<Row>(Row.class, this, SudokuPackage.SUBGRID__ROWS, SudokuPackage.ROW__SUBGRID);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectWithInverseResolvingEList.ManyInverse<Column>(Column.class, this, SudokuPackage.SUBGRID__COLUMNS, SudokuPackage.COLUMN__SUBGRID);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SudokuPackage.SUBGRID__FIELDS_IN_BOX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFieldsInBox()).basicAdd(otherEnd, msgs);
			case SudokuPackage.SUBGRID__ROWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRows()).basicAdd(otherEnd, msgs);
			case SudokuPackage.SUBGRID__COLUMNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumns()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SudokuPackage.SUBGRID__FIELDS_IN_BOX:
				return ((InternalEList<?>)getFieldsInBox()).basicRemove(otherEnd, msgs);
			case SudokuPackage.SUBGRID__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
			case SudokuPackage.SUBGRID__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SudokuPackage.SUBGRID__FIELDS_IN_BOX:
				return getFieldsInBox();
			case SudokuPackage.SUBGRID__ROWS:
				return getRows();
			case SudokuPackage.SUBGRID__COLUMNS:
				return getColumns();
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
			case SudokuPackage.SUBGRID__FIELDS_IN_BOX:
				getFieldsInBox().clear();
				getFieldsInBox().addAll((Collection<? extends Field>)newValue);
				return;
			case SudokuPackage.SUBGRID__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends Row>)newValue);
				return;
			case SudokuPackage.SUBGRID__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
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
			case SudokuPackage.SUBGRID__FIELDS_IN_BOX:
				getFieldsInBox().clear();
				return;
			case SudokuPackage.SUBGRID__ROWS:
				getRows().clear();
				return;
			case SudokuPackage.SUBGRID__COLUMNS:
				getColumns().clear();
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
			case SudokuPackage.SUBGRID__FIELDS_IN_BOX:
				return fieldsInBox != null && !fieldsInBox.isEmpty();
			case SudokuPackage.SUBGRID__ROWS:
				return rows != null && !rows.isEmpty();
			case SudokuPackage.SUBGRID__COLUMNS:
				return columns != null && !columns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubgridImpl
