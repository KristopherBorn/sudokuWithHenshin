/**
 */
package sudoku;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subgrid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sudoku.Subgrid#getFieldsInBox <em>Fields In Box</em>}</li>
 *   <li>{@link sudoku.Subgrid#getRows <em>Rows</em>}</li>
 *   <li>{@link sudoku.Subgrid#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see sudoku.SudokuPackage#getSubgrid()
 * @model
 * @generated
 */
public interface Subgrid extends EObject {
	/**
	 * Returns the value of the '<em><b>Fields In Box</b></em>' reference list.
	 * The list contents are of type {@link sudoku.Field}.
	 * It is bidirectional and its opposite is '{@link sudoku.Field#getSubGrid <em>Sub Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields In Box</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields In Box</em>' reference list.
	 * @see sudoku.SudokuPackage#getSubgrid_FieldsInBox()
	 * @see sudoku.Field#getSubGrid
	 * @model opposite="subGrid" lower="9" upper="9"
	 * @generated
	 */
	EList<Field> getFieldsInBox();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' reference list.
	 * The list contents are of type {@link sudoku.Row}.
	 * It is bidirectional and its opposite is '{@link sudoku.Row#getSubgrid <em>Subgrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' reference list.
	 * @see sudoku.SudokuPackage#getSubgrid_Rows()
	 * @see sudoku.Row#getSubgrid
	 * @model opposite="subgrid" lower="3" upper="3"
	 * @generated
	 */
	EList<Row> getRows();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link sudoku.Column}.
	 * It is bidirectional and its opposite is '{@link sudoku.Column#getSubgrid <em>Subgrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see sudoku.SudokuPackage#getSubgrid_Columns()
	 * @see sudoku.Column#getSubgrid
	 * @model opposite="subgrid" lower="3" upper="3"
	 * @generated
	 */
	EList<Column> getColumns();

} // Subgrid
