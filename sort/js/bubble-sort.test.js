import { bubbleSort } from './bubble-sort'

test('should sort an array of 11 ints', () => {
  const inputToBeSorted = [99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0];
  bubbleSort(inputToBeSorted)
  expect(inputToBeSorted).toEqual([0, 1, 2, 4, 5, 6, 44, 63, 87, 99, 283])
})


test('should sort an array with a single item', () => {
  const inputToBeSorted = [99];
  bubbleSort(inputToBeSorted)
  expect(inputToBeSorted).toEqual([99])
})