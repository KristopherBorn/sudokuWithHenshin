/**
 */
package sudoku;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sudoku.Field#getValue <em>Value</em>}</li>
 *   <li>{@link sudoku.Field#getSubGrid <em>Sub Grid</em>}</li>
 *   <li>{@link sudoku.Field#isOneCandidate <em>One Candidate</em>}</li>
 *   <li>{@link sudoku.Field#isTwoCandidate <em>Two Candidate</em>}</li>
 *   <li>{@link sudoku.Field#isThreeCandidate <em>Three Candidate</em>}</li>
 *   <li>{@link sudoku.Field#isFourCandidate <em>Four Candidate</em>}</li>
 *   <li>{@link sudoku.Field#isFiveCandidate <em>Five Candidate</em>}</li>
 *   <li>{@link sudoku.Field#isSixCandidate <em>Six Candidate</em>}</li>
 *   <li>{@link sudoku.Field#isSevenCandidate <em>Seven Candidate</em>}</li>
 *   <li>{@link sudoku.Field#isEightCandidate <em>Eight Candidate</em>}</li>
 *   <li>{@link sudoku.Field#isNineCandidate <em>Nine Candidate</em>}</li>
 * </ul>
 *
 * @see sudoku.SudokuPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see sudoku.SudokuPackage#getField_Value()
	 * @model default="0"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link sudoku.Field#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Sub Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Grid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Grid</em>' reference.
	 * @see #setSubGrid(Subgrid)
	 * @see sudoku.SudokuPackage#getField_SubGrid()
	 * @model required="true"
	 * @generated
	 */
	Subgrid getSubGrid();

	/**
	 * Sets the value of the '{@link sudoku.Field#getSubGrid <em>Sub Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Grid</em>' reference.
	 * @see #getSubGrid()
	 * @generated
	 */
	void setSubGrid(Subgrid value);

	/**
	 * Returns the value of the '<em><b>One Candidate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One Candidate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Candidate</em>' attribute.
	 * @see #setOneCandidate(boolean)
	 * @see sudoku.SudokuPackage#getField_OneCandidate()
	 * @model default="true"
	 * @generated
	 */
	boolean isOneCandidate();

	/**
	 * Sets the value of the '{@link sudoku.Field#isOneCandidate <em>One Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Candidate</em>' attribute.
	 * @see #isOneCandidate()
	 * @generated
	 */
	void setOneCandidate(boolean value);

	/**
	 * Returns the value of the '<em><b>Two Candidate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Two Candidate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Two Candidate</em>' attribute.
	 * @see #setTwoCandidate(boolean)
	 * @see sudoku.SudokuPackage#getField_TwoCandidate()
	 * @model default="true"
	 * @generated
	 */
	boolean isTwoCandidate();

	/**
	 * Sets the value of the '{@link sudoku.Field#isTwoCandidate <em>Two Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Two Candidate</em>' attribute.
	 * @see #isTwoCandidate()
	 * @generated
	 */
	void setTwoCandidate(boolean value);

	/**
	 * Returns the value of the '<em><b>Three Candidate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Three Candidate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Three Candidate</em>' attribute.
	 * @see #setThreeCandidate(boolean)
	 * @see sudoku.SudokuPackage#getField_ThreeCandidate()
	 * @model default="true"
	 * @generated
	 */
	boolean isThreeCandidate();

	/**
	 * Sets the value of the '{@link sudoku.Field#isThreeCandidate <em>Three Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Three Candidate</em>' attribute.
	 * @see #isThreeCandidate()
	 * @generated
	 */
	void setThreeCandidate(boolean value);

	/**
	 * Returns the value of the '<em><b>Four Candidate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Four Candidate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Four Candidate</em>' attribute.
	 * @see #setFourCandidate(boolean)
	 * @see sudoku.SudokuPackage#getField_FourCandidate()
	 * @model default="true"
	 * @generated
	 */
	boolean isFourCandidate();

	/**
	 * Sets the value of the '{@link sudoku.Field#isFourCandidate <em>Four Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Four Candidate</em>' attribute.
	 * @see #isFourCandidate()
	 * @generated
	 */
	void setFourCandidate(boolean value);

	/**
	 * Returns the value of the '<em><b>Five Candidate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Five Candidate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Five Candidate</em>' attribute.
	 * @see #setFiveCandidate(boolean)
	 * @see sudoku.SudokuPackage#getField_FiveCandidate()
	 * @model default="true"
	 * @generated
	 */
	boolean isFiveCandidate();

	/**
	 * Sets the value of the '{@link sudoku.Field#isFiveCandidate <em>Five Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Five Candidate</em>' attribute.
	 * @see #isFiveCandidate()
	 * @generated
	 */
	void setFiveCandidate(boolean value);

	/**
	 * Returns the value of the '<em><b>Six Candidate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Six Candidate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Six Candidate</em>' attribute.
	 * @see #setSixCandidate(boolean)
	 * @see sudoku.SudokuPackage#getField_SixCandidate()
	 * @model default="true"
	 * @generated
	 */
	boolean isSixCandidate();

	/**
	 * Sets the value of the '{@link sudoku.Field#isSixCandidate <em>Six Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Six Candidate</em>' attribute.
	 * @see #isSixCandidate()
	 * @generated
	 */
	void setSixCandidate(boolean value);

	/**
	 * Returns the value of the '<em><b>Seven Candidate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seven Candidate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seven Candidate</em>' attribute.
	 * @see #setSevenCandidate(boolean)
	 * @see sudoku.SudokuPackage#getField_SevenCandidate()
	 * @model default="true"
	 * @generated
	 */
	boolean isSevenCandidate();

	/**
	 * Sets the value of the '{@link sudoku.Field#isSevenCandidate <em>Seven Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seven Candidate</em>' attribute.
	 * @see #isSevenCandidate()
	 * @generated
	 */
	void setSevenCandidate(boolean value);

	/**
	 * Returns the value of the '<em><b>Eight Candidate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eight Candidate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eight Candidate</em>' attribute.
	 * @see #setEightCandidate(boolean)
	 * @see sudoku.SudokuPackage#getField_EightCandidate()
	 * @model default="true"
	 * @generated
	 */
	boolean isEightCandidate();

	/**
	 * Sets the value of the '{@link sudoku.Field#isEightCandidate <em>Eight Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eight Candidate</em>' attribute.
	 * @see #isEightCandidate()
	 * @generated
	 */
	void setEightCandidate(boolean value);

	/**
	 * Returns the value of the '<em><b>Nine Candidate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nine Candidate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nine Candidate</em>' attribute.
	 * @see #setNineCandidate(boolean)
	 * @see sudoku.SudokuPackage#getField_NineCandidate()
	 * @model default="true"
	 * @generated
	 */
	boolean isNineCandidate();

	/**
	 * Sets the value of the '{@link sudoku.Field#isNineCandidate <em>Nine Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nine Candidate</em>' attribute.
	 * @see #isNineCandidate()
	 * @generated
	 */
	void setNineCandidate(boolean value);

} // Field
