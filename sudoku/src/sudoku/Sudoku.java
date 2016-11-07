/**
 */
package sudoku;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sudoku</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sudoku.Sudoku#getGrid <em>Grid</em>}</li>
 *   <li>{@link sudoku.Sudoku#getRows <em>Rows</em>}</li>
 *   <li>{@link sudoku.Sudoku#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see sudoku.SudokuPackage#getSudoku()
 * @model
 * @generated
 */
public interface Sudoku extends EObject {
	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' containment reference.
	 * @see #setGrid(Grid)
	 * @see sudoku.SudokuPackage#getSudoku_Grid()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Grid getGrid();

	/**
	 * Sets the value of the '{@link sudoku.Sudoku#getGrid <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' containment reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(Grid value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link sudoku.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see sudoku.SudokuPackage#getSudoku_Rows()
	 * @model containment="true" lower="9" upper="9"
	 * @generated
	 */
	EList<Row> getRows();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link sudoku.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see sudoku.SudokuPackage#getSudoku_Columns()
	 * @model containment="true" lower="9" upper="9"
	 * @generated
	 */
	EList<Column> getColumns();

} // Sudoku
