/**
 */
package sudoku;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sudoku.SudokuFactory
 * @model kind="package"
 * @generated
 */
public interface SudokuPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sudoku";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mymodel.org/sudoku";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sudoku";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SudokuPackage eINSTANCE = sudoku.impl.SudokuPackageImpl.init();

	/**
	 * The meta object id for the '{@link sudoku.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sudoku.impl.GridImpl
	 * @see sudoku.impl.SudokuPackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 0;

	/**
	 * The feature id for the '<em><b>Subgrids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__SUBGRIDS = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__FIELDS = 1;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sudoku.impl.SubgridImpl <em>Subgrid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sudoku.impl.SubgridImpl
	 * @see sudoku.impl.SudokuPackageImpl#getSubgrid()
	 * @generated
	 */
	int SUBGRID = 1;

	/**
	 * The feature id for the '<em><b>Filds In Box</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRID__FILDS_IN_BOX = 0;

	/**
	 * The number of structural features of the '<em>Subgrid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRID_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Subgrid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sudoku.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sudoku.impl.FieldImpl
	 * @see sudoku.impl.SudokuPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Sub Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SUB_GRID = 1;

	/**
	 * The feature id for the '<em><b>One Candidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ONE_CANDIDATE = 2;

	/**
	 * The feature id for the '<em><b>Two Candidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TWO_CANDIDATE = 3;

	/**
	 * The feature id for the '<em><b>Three Candidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__THREE_CANDIDATE = 4;

	/**
	 * The feature id for the '<em><b>Four Candidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FOUR_CANDIDATE = 5;

	/**
	 * The feature id for the '<em><b>Five Candidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FIVE_CANDIDATE = 6;

	/**
	 * The feature id for the '<em><b>Six Candidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SIX_CANDIDATE = 7;

	/**
	 * The feature id for the '<em><b>Seven Candidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SEVEN_CANDIDATE = 8;

	/**
	 * The feature id for the '<em><b>Eight Candidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__EIGHT_CANDIDATE = 9;

	/**
	 * The feature id for the '<em><b>Nine Candidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NINE_CANDIDATE = 10;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sudoku.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sudoku.impl.RowImpl
	 * @see sudoku.impl.SudokuPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 3;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__FIELDS = 0;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sudoku.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sudoku.impl.ColumnImpl
	 * @see sudoku.impl.SudokuPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__FIELDS = 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sudoku.impl.SudokuImpl <em>Sudoku</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sudoku.impl.SudokuImpl
	 * @see sudoku.impl.SudokuPackageImpl#getSudoku()
	 * @generated
	 */
	int SUDOKU = 5;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUDOKU__GRID = 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUDOKU__ROWS = 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUDOKU__COLUMNS = 2;

	/**
	 * The number of structural features of the '<em>Sudoku</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUDOKU_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sudoku</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUDOKU_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link sudoku.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see sudoku.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the containment reference list '{@link sudoku.Grid#getSubgrids <em>Subgrids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subgrids</em>'.
	 * @see sudoku.Grid#getSubgrids()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Subgrids();

	/**
	 * Returns the meta object for the containment reference list '{@link sudoku.Grid#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see sudoku.Grid#getFields()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Fields();

	/**
	 * Returns the meta object for class '{@link sudoku.Subgrid <em>Subgrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subgrid</em>'.
	 * @see sudoku.Subgrid
	 * @generated
	 */
	EClass getSubgrid();

	/**
	 * Returns the meta object for the reference list '{@link sudoku.Subgrid#getFildsInBox <em>Filds In Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Filds In Box</em>'.
	 * @see sudoku.Subgrid#getFildsInBox()
	 * @see #getSubgrid()
	 * @generated
	 */
	EReference getSubgrid_FildsInBox();

	/**
	 * Returns the meta object for class '{@link sudoku.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see sudoku.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link sudoku.Field#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sudoku.Field#getValue()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Value();

	/**
	 * Returns the meta object for the reference '{@link sudoku.Field#getSubGrid <em>Sub Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Grid</em>'.
	 * @see sudoku.Field#getSubGrid()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_SubGrid();

	/**
	 * Returns the meta object for the attribute '{@link sudoku.Field#isOneCandidate <em>One Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One Candidate</em>'.
	 * @see sudoku.Field#isOneCandidate()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_OneCandidate();

	/**
	 * Returns the meta object for the attribute '{@link sudoku.Field#isTwoCandidate <em>Two Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Two Candidate</em>'.
	 * @see sudoku.Field#isTwoCandidate()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_TwoCandidate();

	/**
	 * Returns the meta object for the attribute '{@link sudoku.Field#isThreeCandidate <em>Three Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Three Candidate</em>'.
	 * @see sudoku.Field#isThreeCandidate()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_ThreeCandidate();

	/**
	 * Returns the meta object for the attribute '{@link sudoku.Field#isFourCandidate <em>Four Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Four Candidate</em>'.
	 * @see sudoku.Field#isFourCandidate()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_FourCandidate();

	/**
	 * Returns the meta object for the attribute '{@link sudoku.Field#isFiveCandidate <em>Five Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Five Candidate</em>'.
	 * @see sudoku.Field#isFiveCandidate()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_FiveCandidate();

	/**
	 * Returns the meta object for the attribute '{@link sudoku.Field#isSixCandidate <em>Six Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Six Candidate</em>'.
	 * @see sudoku.Field#isSixCandidate()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_SixCandidate();

	/**
	 * Returns the meta object for the attribute '{@link sudoku.Field#isSevenCandidate <em>Seven Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seven Candidate</em>'.
	 * @see sudoku.Field#isSevenCandidate()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_SevenCandidate();

	/**
	 * Returns the meta object for the attribute '{@link sudoku.Field#isEightCandidate <em>Eight Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eight Candidate</em>'.
	 * @see sudoku.Field#isEightCandidate()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_EightCandidate();

	/**
	 * Returns the meta object for the attribute '{@link sudoku.Field#isNineCandidate <em>Nine Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nine Candidate</em>'.
	 * @see sudoku.Field#isNineCandidate()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_NineCandidate();

	/**
	 * Returns the meta object for class '{@link sudoku.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see sudoku.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the reference list '{@link sudoku.Row#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see sudoku.Row#getFields()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Fields();

	/**
	 * Returns the meta object for class '{@link sudoku.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see sudoku.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the reference list '{@link sudoku.Column#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see sudoku.Column#getFields()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Fields();

	/**
	 * Returns the meta object for class '{@link sudoku.Sudoku <em>Sudoku</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sudoku</em>'.
	 * @see sudoku.Sudoku
	 * @generated
	 */
	EClass getSudoku();

	/**
	 * Returns the meta object for the containment reference '{@link sudoku.Sudoku#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grid</em>'.
	 * @see sudoku.Sudoku#getGrid()
	 * @see #getSudoku()
	 * @generated
	 */
	EReference getSudoku_Grid();

	/**
	 * Returns the meta object for the containment reference list '{@link sudoku.Sudoku#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see sudoku.Sudoku#getRows()
	 * @see #getSudoku()
	 * @generated
	 */
	EReference getSudoku_Rows();

	/**
	 * Returns the meta object for the containment reference list '{@link sudoku.Sudoku#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see sudoku.Sudoku#getColumns()
	 * @see #getSudoku()
	 * @generated
	 */
	EReference getSudoku_Columns();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SudokuFactory getSudokuFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sudoku.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sudoku.impl.GridImpl
		 * @see sudoku.impl.SudokuPackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '<em><b>Subgrids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__SUBGRIDS = eINSTANCE.getGrid_Subgrids();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__FIELDS = eINSTANCE.getGrid_Fields();

		/**
		 * The meta object literal for the '{@link sudoku.impl.SubgridImpl <em>Subgrid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sudoku.impl.SubgridImpl
		 * @see sudoku.impl.SudokuPackageImpl#getSubgrid()
		 * @generated
		 */
		EClass SUBGRID = eINSTANCE.getSubgrid();

		/**
		 * The meta object literal for the '<em><b>Filds In Box</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBGRID__FILDS_IN_BOX = eINSTANCE.getSubgrid_FildsInBox();

		/**
		 * The meta object literal for the '{@link sudoku.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sudoku.impl.FieldImpl
		 * @see sudoku.impl.SudokuPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__VALUE = eINSTANCE.getField_Value();

		/**
		 * The meta object literal for the '<em><b>Sub Grid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__SUB_GRID = eINSTANCE.getField_SubGrid();

		/**
		 * The meta object literal for the '<em><b>One Candidate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__ONE_CANDIDATE = eINSTANCE.getField_OneCandidate();

		/**
		 * The meta object literal for the '<em><b>Two Candidate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TWO_CANDIDATE = eINSTANCE.getField_TwoCandidate();

		/**
		 * The meta object literal for the '<em><b>Three Candidate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__THREE_CANDIDATE = eINSTANCE.getField_ThreeCandidate();

		/**
		 * The meta object literal for the '<em><b>Four Candidate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__FOUR_CANDIDATE = eINSTANCE.getField_FourCandidate();

		/**
		 * The meta object literal for the '<em><b>Five Candidate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__FIVE_CANDIDATE = eINSTANCE.getField_FiveCandidate();

		/**
		 * The meta object literal for the '<em><b>Six Candidate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__SIX_CANDIDATE = eINSTANCE.getField_SixCandidate();

		/**
		 * The meta object literal for the '<em><b>Seven Candidate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__SEVEN_CANDIDATE = eINSTANCE.getField_SevenCandidate();

		/**
		 * The meta object literal for the '<em><b>Eight Candidate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__EIGHT_CANDIDATE = eINSTANCE.getField_EightCandidate();

		/**
		 * The meta object literal for the '<em><b>Nine Candidate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NINE_CANDIDATE = eINSTANCE.getField_NineCandidate();

		/**
		 * The meta object literal for the '{@link sudoku.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sudoku.impl.RowImpl
		 * @see sudoku.impl.SudokuPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__FIELDS = eINSTANCE.getRow_Fields();

		/**
		 * The meta object literal for the '{@link sudoku.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sudoku.impl.ColumnImpl
		 * @see sudoku.impl.SudokuPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__FIELDS = eINSTANCE.getColumn_Fields();

		/**
		 * The meta object literal for the '{@link sudoku.impl.SudokuImpl <em>Sudoku</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sudoku.impl.SudokuImpl
		 * @see sudoku.impl.SudokuPackageImpl#getSudoku()
		 * @generated
		 */
		EClass SUDOKU = eINSTANCE.getSudoku();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUDOKU__GRID = eINSTANCE.getSudoku_Grid();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUDOKU__ROWS = eINSTANCE.getSudoku_Rows();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUDOKU__COLUMNS = eINSTANCE.getSudoku_Columns();

	}

} //SudokuPackage
