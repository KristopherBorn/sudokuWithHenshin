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
 *   <li>{@link sudoku.Subgrid#getFildsInBox <em>Filds In Box</em>}</li>
 * </ul>
 *
 * @see sudoku.SudokuPackage#getSubgrid()
 * @model
 * @generated
 */
public interface Subgrid extends EObject {
	/**
	 * Returns the value of the '<em><b>Filds In Box</b></em>' reference list.
	 * The list contents are of type {@link sudoku.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filds In Box</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filds In Box</em>' reference list.
	 * @see sudoku.SudokuPackage#getSubgrid_FildsInBox()
	 * @model lower="9" upper="9"
	 * @generated
	 */
	EList<Field> getFildsInBox();

} // Subgrid
