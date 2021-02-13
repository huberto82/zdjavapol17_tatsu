## NumberTatsuUtilsTest
- (x) shouldReturnTrue
- (x) shouldReturnFalse
- (x) shouldReturnSum

## StringTatsuUtilsTest
- (x) shouldReturnTrueWhenProductionIsOn
- (x) shouldReturnFalseWhenDevIsOff
- (x) shouldReturnTrueWhenStringIsBlank
- (x) shouldReturnFalseWhenStringIsNotBlank
- (x) shouldReturnFalseWhenEmailIsNotValid
- (x) shouldReturnTrueWhenEmailIsValid
- (x) shouldReturnFullName

## CollectionTatsuUtilsTest
- (x) shouldReturnEmptyListWhenTypeIsNotValid
- (x) shouldReturnFirstGroupOfColors
- (x) shouldReturnSecondGroupOfColors

## PersonDtoTest
- (x) shouldReturnEmptyObject
- (x) shouldReturnPerson

## PersonMapperTest
- (x) shouldReturnNull
- (x) shouldReturnDto
- (x) shouldReturnEmptyList
- (x) shouldReturnList
- (.) shouldReturnSet

## BookTypesTest
- (.) shouldReturnDefaultEnumInCaseOfNullOrInvalidValue
- (.) shouldReturnEnumByString
- (.) shouldReturnEnumByStringAndIgnoreCase

## BookServiceTest
- (.) shouldCallGetOneWhenIdIsValid
- (.) shouldNotCallGetOneWhenIdIsValid
- (.) shouldCallFindAll
- (.) shouldCallSaveAndFlash
- (.) shouldNotCallSaveAndFlashWhenObjectIsEqualToNull
- (.) shouldCallDeleteById
- (.) shouldSaveAndFlashInCaseOfUpdate

## BookDtoServiceTest
- (.) shouldNotReturnBook
- (.) shouldReturnBook
- (.) shouldReturnEmptyList
- (.) shouldReturnList

## HomeControllerTest
- (.) shouldReturnController

## HomeControllerTest2
- (.) shouldReturnHelloWorld
- (.) shouldReturnGoAway

## PersonRestControllerTest
- (.) shouldReturnController

## PersonRestControllerTest2
- (.) shouldReturnPerson
- (.) shouldReturnListOfPersons

## BooksControllerTest
- (.) shouldReturnPerson
- (.) shouldReturnPersons
