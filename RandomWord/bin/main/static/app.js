const randomString = document.getElementById("randomString");
const randomStringBtn = document.getElementById("randomStringBtn");
const inputDisplay = document.getElementById("display");

randomStringBtn.addEventListener("click", () => {
	axios.post("/api/v1/randomProcess", {randomString : randomString.value}).then((res) => {
		inputDisplay.value = res.data.randomString
	})
	
	
})
