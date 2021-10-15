import axios from 'axios'

function getQuestions() {
  return axios
    .get('/api/question')
    .then(response => response.data)
    .catch(err => console.error(err))
}

function addQuestion(newQuestion) {
  return axios
    .post('/api/question', newQuestion)
    .then(response => response.data)
    .catch(console.error)
}
 function validateAnswers(validationObject){
  return axios
      .post('/api/question/validate', validationObject)
      .then(response => response.data)
      .catch(console.error)
}
export { getQuestions, addQuestion, validateAnswers }
