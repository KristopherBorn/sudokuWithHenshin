/**
 */
package sudoku;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sudoku.Column#getFields <em>Fields</em>}</li>
 *   <li>{@link sudoku.Column#getSubgrid <em>Subgrid</em>}</li>
 * </ul>
 *
 * @see sudoku.SudokuPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link sudoku.Field}.
	 * It is bidirectional and its opposite is '{@link sudoku.Field#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see sudoku.SudokuPackage#getColumn_Fields()
	 * @see sudoku.Field#getColumn
	 * @model opposite="column" lower="9" upper="9"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Subgrid</b></em>' reference list.
	 * The list contents are of type {@link sudoku.Subgrid}.
	 * It is bidirectional and its opposite is '{@link sudoku.Subgrid#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgrid</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgrid</em>' reference list.
	 * @see sudoku.SudokuPackage#getColumn_Subgrid()
	 * @see sudoku.Subgrid#getColumns
	 * @model opposite="columns" lower="3" upper="3"
	 * @generated
	 */
	EList<Subgrid> getSubgrid();

} // Column
