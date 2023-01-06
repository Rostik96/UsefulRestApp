# Небольшой python-скрипт для теста метода PeopleController#getPerson
import requests

id = int(input("Введи id человека\n"))

URL = f"http://localhost:8080/people/{id}"

r = requests.get(url=URL)

if r.status_code == 404:
    print(f"Ошибка от сервера: {r.json()['message']}")
else:
    person = r.json()
    print(f"Имя человека: {person['name']}")
