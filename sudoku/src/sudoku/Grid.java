/**
 */
package sudoku;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sudoku.Grid#getSubgrids <em>Subgrids</em>}</li>
 *   <li>{@link sudoku.Grid#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see sudoku.SudokuPackage#getGrid()
 * @model
 * @generated
 */
public interface Grid extends EObject {
	/**
	 * Returns the value of the '<em><b>Subgrids</b></em>' containment reference list.
	 * The list contents are of type {@link sudoku.Subgrid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgrids</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgrids</em>' containment reference list.
	 * @see sudoku.SudokuPackage#getGrid_Subgrids()
	 * @model containment="true" lower="9" upper="9"
	 * @generated
	 */
	EList<Subgrid> getSubgrids();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link sudoku.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see sudoku.SudokuPackage#getGrid_Fields()
	 * @model containment="true" lower="81" upper="81"
	 * @generated
	 */
	EList<Field> getFields();

} // Grid
