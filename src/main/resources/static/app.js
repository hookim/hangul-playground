const randomString = document.getElementById("randomString");
const randomStringBtn = document.getElementById("randomStringBtn");
const inputDisplay = document.getElementById("display");
const urlPath = document.getElementById("urlPath")


randomStringBtn.addEventListener("click", () => {
	axios.post(urlPath.value, {randomString : randomString.value}).then((res) => {
		inputDisplay.value = res.data.randomString
	})
	
	
})
