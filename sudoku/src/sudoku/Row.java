/**
 */
package sudoku;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sudoku.Row#getFields <em>Fields</em>}</li>
 *   <li>{@link sudoku.Row#getSubgrid <em>Subgrid</em>}</li>
 * </ul>
 *
 * @see sudoku.SudokuPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link sudoku.Field}.
	 * It is bidirectional and its opposite is '{@link sudoku.Field#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see sudoku.SudokuPackage#getRow_Fields()
	 * @see sudoku.Field#getRow
	 * @model opposite="row" lower="9" upper="9"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Subgrid</b></em>' reference list.
	 * The list contents are of type {@link sudoku.Subgrid}.
	 * It is bidirectional and its opposite is '{@link sudoku.Subgrid#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgrid</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgrid</em>' reference list.
	 * @see sudoku.SudokuPackage#getRow_Subgrid()
	 * @see sudoku.Subgrid#getRows
	 * @model opposite="rows" lower="3" upper="3"
	 * @generated
	 */
	EList<Subgrid> getSubgrid();

} // Row
