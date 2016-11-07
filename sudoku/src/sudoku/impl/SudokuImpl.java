/**
 */
package sudoku.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sudoku.Column;
import sudoku.Grid;
import sudoku.Row;
import sudoku.Sudoku;
import sudoku.SudokuPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sudoku</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sudoku.impl.SudokuImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link sudoku.impl.SudokuImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link sudoku.impl.SudokuImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SudokuImpl extends MinimalEObjectImpl.Container implements Sudoku {
	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected Grid grid;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> rows;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
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
	protected SudokuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SudokuPackage.Literals.SUDOKU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid getGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrid(Grid newGrid, NotificationChain msgs) {
		Grid oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SudokuPackage.SUDOKU__GRID, oldGrid, newGrid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(Grid newGrid) {
		if (newGrid != grid) {
			NotificationChain msgs = null;
			if (grid != null)
				msgs = ((InternalEObject)grid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SudokuPackage.SUDOKU__GRID, null, msgs);
			if (newGrid != null)
				msgs = ((InternalEObject)newGrid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SudokuPackage.SUDOKU__GRID, null, msgs);
			msgs = basicSetGrid(newGrid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SudokuPackage.SUDOKU__GRID, newGrid, newGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentEList<Row>(Row.class, this, SudokuPackage.SUDOKU__ROWS);
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
			columns = new EObjectContainmentEList<Column>(Column.class, this, SudokuPackage.SUDOKU__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SudokuPackage.SUDOKU__GRID:
				return basicSetGrid(null, msgs);
			case SudokuPackage.SUDOKU__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
			case SudokuPackage.SUDOKU__COLUMNS:
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
			case SudokuPackage.SUDOKU__GRID:
				return getGrid();
			case SudokuPackage.SUDOKU__ROWS:
				return getRows();
			case SudokuPackage.SUDOKU__COLUMNS:
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
			case SudokuPackage.SUDOKU__GRID:
				setGrid((Grid)newValue);
				return;
			case SudokuPackage.SUDOKU__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends Row>)newValue);
				return;
			case SudokuPackage.SUDOKU__COLUMNS:
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
			case SudokuPackage.SUDOKU__GRID:
				setGrid((Grid)null);
				return;
			case SudokuPackage.SUDOKU__ROWS:
				getRows().clear();
				return;
			case SudokuPackage.SUDOKU__COLUMNS:
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
			case SudokuPackage.SUDOKU__GRID:
				return grid != null;
			case SudokuPackage.SUDOKU__ROWS:
				return rows != null && !rows.isEmpty();
			case SudokuPackage.SUDOKU__COLUMNS:
				return columns != null && !columns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SudokuImpl
