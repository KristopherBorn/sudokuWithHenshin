/**
 */
package sudoku.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sudoku.Column;
import sudoku.Field;
import sudoku.Row;
import sudoku.Subgrid;
import sudoku.SudokuPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sudoku.impl.FieldImpl#getValue <em>Value</em>}</li>
 *   <li>{@link sudoku.impl.FieldImpl#getSubGrid <em>Sub Grid</em>}</li>
 *   <li>{@link sudoku.impl.FieldImpl#isOneCandidate <em>One Candidate</em>}</li>
 *   <li>{@link sudoku.impl.FieldImpl#isTwoCandidate <em>Two Candidate</em>}</li>
 *   <li>{@link sudoku.impl.FieldImpl#isThreeCandidate <em>Three Candidate</em>}</li>
 *   <li>{@link sudoku.impl.FieldImpl#isFourCandidate <em>Four Candidate</em>}</li>
 *   <li>{@link sudoku.impl.FieldImpl#isFiveCandidate <em>Five Candidate</em>}</li>
 *   <li>{@link sudoku.impl.FieldImpl#isSixCandidate <em>Six Candidate</em>}</li>
 *   <li>{@link sudoku.impl.FieldImpl#isSevenCandidate <em>Seven Candidate</em>}</li>
 *   <li>{@link sudoku.impl.FieldImpl#isEightCandidate <em>Eight Candidate</em>}</li>
 *   <li>{@link sudoku.impl.FieldImpl#isNineCandidate <em>Nine Candidate</em>}</li>
 *   <li>{@link sudoku.impl.FieldImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link sudoku.impl.FieldImpl#getRow <em>Row</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubGrid() <em>Sub Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGrid()
	 * @generated
	 * @ordered
	 */
	protected Subgrid subGrid;

	/**
	 * The default value of the '{@link #isOneCandidate() <em>One Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOneCandidate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONE_CANDIDATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOneCandidate() <em>One Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOneCandidate()
	 * @generated
	 * @ordered
	 */
	protected boolean oneCandidate = ONE_CANDIDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTwoCandidate() <em>Two Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTwoCandidate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TWO_CANDIDATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTwoCandidate() <em>Two Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTwoCandidate()
	 * @generated
	 * @ordered
	 */
	protected boolean twoCandidate = TWO_CANDIDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isThreeCandidate() <em>Three Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreeCandidate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THREE_CANDIDATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isThreeCandidate() <em>Three Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreeCandidate()
	 * @generated
	 * @ordered
	 */
	protected boolean threeCandidate = THREE_CANDIDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFourCandidate() <em>Four Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFourCandidate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOUR_CANDIDATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFourCandidate() <em>Four Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFourCandidate()
	 * @generated
	 * @ordered
	 */
	protected boolean fourCandidate = FOUR_CANDIDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFiveCandidate() <em>Five Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiveCandidate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIVE_CANDIDATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFiveCandidate() <em>Five Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiveCandidate()
	 * @generated
	 * @ordered
	 */
	protected boolean fiveCandidate = FIVE_CANDIDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSixCandidate() <em>Six Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSixCandidate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIX_CANDIDATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSixCandidate() <em>Six Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSixCandidate()
	 * @generated
	 * @ordered
	 */
	protected boolean sixCandidate = SIX_CANDIDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSevenCandidate() <em>Seven Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSevenCandidate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEVEN_CANDIDATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSevenCandidate() <em>Seven Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSevenCandidate()
	 * @generated
	 * @ordered
	 */
	protected boolean sevenCandidate = SEVEN_CANDIDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEightCandidate() <em>Eight Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEightCandidate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EIGHT_CANDIDATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEightCandidate() <em>Eight Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEightCandidate()
	 * @generated
	 * @ordered
	 */
	protected boolean eightCandidate = EIGHT_CANDIDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNineCandidate() <em>Nine Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNineCandidate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NINE_CANDIDATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNineCandidate() <em>Nine Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNineCandidate()
	 * @generated
	 * @ordered
	 */
	protected boolean nineCandidate = NINE_CANDIDATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected Column column;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected Row row;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SudokuPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subgrid getSubGrid() {
		if (subGrid != null && subGrid.eIsProxy()) {
			InternalEObject oldSubGrid = (InternalEObject)subGrid;
			subGrid = (Subgrid)eResolveProxy(oldSubGrid);
			if (subGrid != oldSubGrid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SudokuPackage.FIELD__SUB_GRID, oldSubGrid, subGrid));
			}
		}
		return subGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subgrid basicGetSubGrid() {
		return subGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubGrid(Subgrid newSubGrid, NotificationChain msgs) {
		Subgrid oldSubGrid = subGrid;
		subGrid = newSubGrid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__SUB_GRID, oldSubGrid, newSubGrid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubGrid(Subgrid newSubGrid) {
		if (newSubGrid != subGrid) {
			NotificationChain msgs = null;
			if (subGrid != null)
				msgs = ((InternalEObject)subGrid).eInverseRemove(this, SudokuPackage.SUBGRID__FIELDS_IN_BOX, Subgrid.class, msgs);
			if (newSubGrid != null)
				msgs = ((InternalEObject)newSubGrid).eInverseAdd(this, SudokuPackage.SUBGRID__FIELDS_IN_BOX, Subgrid.class, msgs);
			msgs = basicSetSubGrid(newSubGrid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__SUB_GRID, newSubGrid, newSubGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOneCandidate() {
		return oneCandidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneCandidate(boolean newOneCandidate) {
		boolean oldOneCandidate = oneCandidate;
		oneCandidate = newOneCandidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__ONE_CANDIDATE, oldOneCandidate, oneCandidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTwoCandidate() {
		return twoCandidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTwoCandidate(boolean newTwoCandidate) {
		boolean oldTwoCandidate = twoCandidate;
		twoCandidate = newTwoCandidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__TWO_CANDIDATE, oldTwoCandidate, twoCandidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThreeCandidate() {
		return threeCandidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreeCandidate(boolean newThreeCandidate) {
		boolean oldThreeCandidate = threeCandidate;
		threeCandidate = newThreeCandidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__THREE_CANDIDATE, oldThreeCandidate, threeCandidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFourCandidate() {
		return fourCandidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFourCandidate(boolean newFourCandidate) {
		boolean oldFourCandidate = fourCandidate;
		fourCandidate = newFourCandidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__FOUR_CANDIDATE, oldFourCandidate, fourCandidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFiveCandidate() {
		return fiveCandidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiveCandidate(boolean newFiveCandidate) {
		boolean oldFiveCandidate = fiveCandidate;
		fiveCandidate = newFiveCandidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__FIVE_CANDIDATE, oldFiveCandidate, fiveCandidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSixCandidate() {
		return sixCandidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSixCandidate(boolean newSixCandidate) {
		boolean oldSixCandidate = sixCandidate;
		sixCandidate = newSixCandidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__SIX_CANDIDATE, oldSixCandidate, sixCandidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSevenCandidate() {
		return sevenCandidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSevenCandidate(boolean newSevenCandidate) {
		boolean oldSevenCandidate = sevenCandidate;
		sevenCandidate = newSevenCandidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__SEVEN_CANDIDATE, oldSevenCandidate, sevenCandidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEightCandidate() {
		return eightCandidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEightCandidate(boolean newEightCandidate) {
		boolean oldEightCandidate = eightCandidate;
		eightCandidate = newEightCandidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__EIGHT_CANDIDATE, oldEightCandidate, eightCandidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNineCandidate() {
		return nineCandidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNineCandidate(boolean newNineCandidate) {
		boolean oldNineCandidate = nineCandidate;
		nineCandidate = newNineCandidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__NINE_CANDIDATE, oldNineCandidate, nineCandidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getColumn() {
		if (column != null && column.eIsProxy()) {
			InternalEObject oldColumn = (InternalEObject)column;
			column = (Column)eResolveProxy(oldColumn);
			if (column != oldColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SudokuPackage.FIELD__COLUMN, oldColumn, column));
			}
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumn(Column newColumn, NotificationChain msgs) {
		Column oldColumn = column;
		column = newColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__COLUMN, oldColumn, newColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(Column newColumn) {
		if (newColumn != column) {
			NotificationChain msgs = null;
			if (column != null)
				msgs = ((InternalEObject)column).eInverseRemove(this, SudokuPackage.COLUMN__FIELDS, Column.class, msgs);
			if (newColumn != null)
				msgs = ((InternalEObject)newColumn).eInverseAdd(this, SudokuPackage.COLUMN__FIELDS, Column.class, msgs);
			msgs = basicSetColumn(newColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__COLUMN, newColumn, newColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row getRow() {
		if (row != null && row.eIsProxy()) {
			InternalEObject oldRow = (InternalEObject)row;
			row = (Row)eResolveProxy(oldRow);
			if (row != oldRow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SudokuPackage.FIELD__ROW, oldRow, row));
			}
		}
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row basicGetRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRow(Row newRow, NotificationChain msgs) {
		Row oldRow = row;
		row = newRow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__ROW, oldRow, newRow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(Row newRow) {
		if (newRow != row) {
			NotificationChain msgs = null;
			if (row != null)
				msgs = ((InternalEObject)row).eInverseRemove(this, SudokuPackage.ROW__FIELDS, Row.class, msgs);
			if (newRow != null)
				msgs = ((InternalEObject)newRow).eInverseAdd(this, SudokuPackage.ROW__FIELDS, Row.class, msgs);
			msgs = basicSetRow(newRow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SudokuPackage.FIELD__ROW, newRow, newRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SudokuPackage.FIELD__SUB_GRID:
				if (subGrid != null)
					msgs = ((InternalEObject)subGrid).eInverseRemove(this, SudokuPackage.SUBGRID__FIELDS_IN_BOX, Subgrid.class, msgs);
				return basicSetSubGrid((Subgrid)otherEnd, msgs);
			case SudokuPackage.FIELD__COLUMN:
				if (column != null)
					msgs = ((InternalEObject)column).eInverseRemove(this, SudokuPackage.COLUMN__FIELDS, Column.class, msgs);
				return basicSetColumn((Column)otherEnd, msgs);
			case SudokuPackage.FIELD__ROW:
				if (row != null)
					msgs = ((InternalEObject)row).eInverseRemove(this, SudokuPackage.ROW__FIELDS, Row.class, msgs);
				return basicSetRow((Row)otherEnd, msgs);
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
			case SudokuPackage.FIELD__SUB_GRID:
				return basicSetSubGrid(null, msgs);
			case SudokuPackage.FIELD__COLUMN:
				return basicSetColumn(null, msgs);
			case SudokuPackage.FIELD__ROW:
				return basicSetRow(null, msgs);
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
			case SudokuPackage.FIELD__VALUE:
				return getValue();
			case SudokuPackage.FIELD__SUB_GRID:
				if (resolve) return getSubGrid();
				return basicGetSubGrid();
			case SudokuPackage.FIELD__ONE_CANDIDATE:
				return isOneCandidate();
			case SudokuPackage.FIELD__TWO_CANDIDATE:
				return isTwoCandidate();
			case SudokuPackage.FIELD__THREE_CANDIDATE:
				return isThreeCandidate();
			case SudokuPackage.FIELD__FOUR_CANDIDATE:
				return isFourCandidate();
			case SudokuPackage.FIELD__FIVE_CANDIDATE:
				return isFiveCandidate();
			case SudokuPackage.FIELD__SIX_CANDIDATE:
				return isSixCandidate();
			case SudokuPackage.FIELD__SEVEN_CANDIDATE:
				return isSevenCandidate();
			case SudokuPackage.FIELD__EIGHT_CANDIDATE:
				return isEightCandidate();
			case SudokuPackage.FIELD__NINE_CANDIDATE:
				return isNineCandidate();
			case SudokuPackage.FIELD__COLUMN:
				if (resolve) return getColumn();
				return basicGetColumn();
			case SudokuPackage.FIELD__ROW:
				if (resolve) return getRow();
				return basicGetRow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SudokuPackage.FIELD__VALUE:
				setValue((Integer)newValue);
				return;
			case SudokuPackage.FIELD__SUB_GRID:
				setSubGrid((Subgrid)newValue);
				return;
			case SudokuPackage.FIELD__ONE_CANDIDATE:
				setOneCandidate((Boolean)newValue);
				return;
			case SudokuPackage.FIELD__TWO_CANDIDATE:
				setTwoCandidate((Boolean)newValue);
				return;
			case SudokuPackage.FIELD__THREE_CANDIDATE:
				setThreeCandidate((Boolean)newValue);
				return;
			case SudokuPackage.FIELD__FOUR_CANDIDATE:
				setFourCandidate((Boolean)newValue);
				return;
			case SudokuPackage.FIELD__FIVE_CANDIDATE:
				setFiveCandidate((Boolean)newValue);
				return;
			case SudokuPackage.FIELD__SIX_CANDIDATE:
				setSixCandidate((Boolean)newValue);
				return;
			case SudokuPackage.FIELD__SEVEN_CANDIDATE:
				setSevenCandidate((Boolean)newValue);
				return;
			case SudokuPackage.FIELD__EIGHT_CANDIDATE:
				setEightCandidate((Boolean)newValue);
				return;
			case SudokuPackage.FIELD__NINE_CANDIDATE:
				setNineCandidate((Boolean)newValue);
				return;
			case SudokuPackage.FIELD__COLUMN:
				setColumn((Column)newValue);
				return;
			case SudokuPackage.FIELD__ROW:
				setRow((Row)newValue);
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
			case SudokuPackage.FIELD__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SudokuPackage.FIELD__SUB_GRID:
				setSubGrid((Subgrid)null);
				return;
			case SudokuPackage.FIELD__ONE_CANDIDATE:
				setOneCandidate(ONE_CANDIDATE_EDEFAULT);
				return;
			case SudokuPackage.FIELD__TWO_CANDIDATE:
				setTwoCandidate(TWO_CANDIDATE_EDEFAULT);
				return;
			case SudokuPackage.FIELD__THREE_CANDIDATE:
				setThreeCandidate(THREE_CANDIDATE_EDEFAULT);
				return;
			case SudokuPackage.FIELD__FOUR_CANDIDATE:
				setFourCandidate(FOUR_CANDIDATE_EDEFAULT);
				return;
			case SudokuPackage.FIELD__FIVE_CANDIDATE:
				setFiveCandidate(FIVE_CANDIDATE_EDEFAULT);
				return;
			case SudokuPackage.FIELD__SIX_CANDIDATE:
				setSixCandidate(SIX_CANDIDATE_EDEFAULT);
				return;
			case SudokuPackage.FIELD__SEVEN_CANDIDATE:
				setSevenCandidate(SEVEN_CANDIDATE_EDEFAULT);
				return;
			case SudokuPackage.FIELD__EIGHT_CANDIDATE:
				setEightCandidate(EIGHT_CANDIDATE_EDEFAULT);
				return;
			case SudokuPackage.FIELD__NINE_CANDIDATE:
				setNineCandidate(NINE_CANDIDATE_EDEFAULT);
				return;
			case SudokuPackage.FIELD__COLUMN:
				setColumn((Column)null);
				return;
			case SudokuPackage.FIELD__ROW:
				setRow((Row)null);
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
			case SudokuPackage.FIELD__VALUE:
				return value != VALUE_EDEFAULT;
			case SudokuPackage.FIELD__SUB_GRID:
				return subGrid != null;
			case SudokuPackage.FIELD__ONE_CANDIDATE:
				return oneCandidate != ONE_CANDIDATE_EDEFAULT;
			case SudokuPackage.FIELD__TWO_CANDIDATE:
				return twoCandidate != TWO_CANDIDATE_EDEFAULT;
			case SudokuPackage.FIELD__THREE_CANDIDATE:
				return threeCandidate != THREE_CANDIDATE_EDEFAULT;
			case SudokuPackage.FIELD__FOUR_CANDIDATE:
				return fourCandidate != FOUR_CANDIDATE_EDEFAULT;
			case SudokuPackage.FIELD__FIVE_CANDIDATE:
				return fiveCandidate != FIVE_CANDIDATE_EDEFAULT;
			case SudokuPackage.FIELD__SIX_CANDIDATE:
				return sixCandidate != SIX_CANDIDATE_EDEFAULT;
			case SudokuPackage.FIELD__SEVEN_CANDIDATE:
				return sevenCandidate != SEVEN_CANDIDATE_EDEFAULT;
			case SudokuPackage.FIELD__EIGHT_CANDIDATE:
				return eightCandidate != EIGHT_CANDIDATE_EDEFAULT;
			case SudokuPackage.FIELD__NINE_CANDIDATE:
				return nineCandidate != NINE_CANDIDATE_EDEFAULT;
			case SudokuPackage.FIELD__COLUMN:
				return column != null;
			case SudokuPackage.FIELD__ROW:
				return row != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", oneCandidate: ");
		result.append(oneCandidate);
		result.append(", twoCandidate: ");
		result.append(twoCandidate);
		result.append(", threeCandidate: ");
		result.append(threeCandidate);
		result.append(", fourCandidate: ");
		result.append(fourCandidate);
		result.append(", fiveCandidate: ");
		result.append(fiveCandidate);
		result.append(", sixCandidate: ");
		result.append(sixCandidate);
		result.append(", sevenCandidate: ");
		result.append(sevenCandidate);
		result.append(", eightCandidate: ");
		result.append(eightCandidate);
		result.append(", nineCandidate: ");
		result.append(nineCandidate);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
