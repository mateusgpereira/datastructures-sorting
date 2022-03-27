export const bubbleSort = (array) => {
  for (let i = 0; i < array.length; i++) {
    for (let j = 0; j < array.length; j++) {
      const a = array[j]
      const b = array[j + 1]
      if (a > b) {
        array[j] = b
        array[j + 1] = a
      }
    }
  }
}